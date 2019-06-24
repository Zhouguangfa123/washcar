var bucket = location.host == "www.flche.cn"
        || location.host == "118.89.190.218" ? 'dq-1256353174'
        : 'dq-test-1256353174';
var region = 'ap-shanghai';

// 实例化COS对象
var cos = new COS({
    // 必选参数
    getAuthorization : function(options, callback) {
        $.ajaxSettings.async = false;
        $.get(location.origin + '/api/tencent/getTencentSign', {
            method : options.Method,
            pathname : '/' + options.Key,
        }, function(Authorization) {
            callback({
                Authorization : Authorization
            // XCosSecurityToken: data.XCosSecurityToken, // 如果是临时密钥计算出来的签名，需要提供
            // XCosSecurityToken
            });
        });
    },
    // 可选参数
    FileParallelLimit : 3, // 控制文件上传并发数
    ChunkParallelLimit : 3, // 控制单个文件下分片上传并发数
    ProgressInterval : 1000, // 控制上传的 onProgress 回调的间隔
});
// 监听选文件
function upLoad(file, filePath) {
    if (!file)
        return 1;
    var filename = file.name;
    // 分片上传文件
    cos.sliceUploadFile({
        Bucket : bucket,
        Region : region,
        Key : filePath,
        Body : file,
    }, function(err) {
        if (err != null) {
            console.log(err, "上传失败！");
            return 1;
        } else {
            return 0;
        }
    });
    /* 这部分是腾讯提供的上传的接口 */
    // cos.putObject({
    // Bucket: bucket, //存储桶用户识别 （必须有）
    // Region: region, //地区识别（必须有）
    // Key: filename, //文件名字（这里需要注意的是，如果名字是一样的，那么后面的会覆盖前面的，所以这个名字不可以重复）（必须有）
    // StorageClass: 'STANDARD',//可以不写
    // Body: file, //上传文件对象（可以不写）
    // onProgress: function(progressData) {
    // console.log(""+JSON.stringify(progressData));
    // }
    // }, function(err, data) {
    // /*这里是为了调试你的代码，可以拿到报错信息*/
    // console.log(err || data);
    // console.log(data.Location);//可以拿到文件地址
    // });	
};