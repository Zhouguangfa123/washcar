package com.hope.washcar.common;

import com.google.gson.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * JsonParse
 *
 * @author zhougf
 * @date 2019/6/12
 */
public class JsonParse {
    public static final Gson GSON = (new GsonBuilder()).enableComplexMapKeySerialization().setDateFormat("yyyy-MM-dd HH:mm:ss:SSS").setPrettyPrinting().disableHtmlEscaping().create();

    public JsonParse() {
    }

    public static JsonObject beanToJsonObject(Object object) {
        return GSON.toJsonTree(object).getAsJsonObject();
    }

    public static JsonArray listToJsonArray(Object object) {
        return GSON.toJsonTree(object).getAsJsonArray();
    }

    public static JsonObject jsonStrToJsonObject(String jsonStr) {
        return (new JsonParser()).parse(jsonStr).getAsJsonObject();
    }

    public static JsonArray jsonStrToJsonArray(String jsonStr) {
        return (new JsonParser()).parse(jsonStr).getAsJsonArray();
    }

    public static <T> T jsonToBean(Map<String, Object> map, String key, Class<T> clazz) {
        return GSON.fromJson(GSON.toJson(map.get(key)), clazz);
    }

    public static <T> List<T> jsonArrayToList(String jsonStr, Class<T> clazz) {
        Type type = new JsonParse.ParameterizedTypeImpl(clazz);
        List<T> list = (List)GSON.fromJson(jsonStr, type);
        return list;
    }

    public static <T> List<T> jsonArrayToList(Map<String, Object> map, String key, Class<T> clazz) {
        return jsonArrayToList(GSON.toJson(map.get(key)), clazz);
    }

    private static class ParameterizedTypeImpl implements ParameterizedType {
        Class<?> clazz;

        public <T> ParameterizedTypeImpl(Class<T> clz) {
            this.clazz = clz;
        }

        @Override
        public Type[] getActualTypeArguments() {
            return new Type[]{this.clazz};
        }

        @Override
        public Type getRawType() {
            return List.class;
        }

        @Override
        public Type getOwnerType() {
            return null;
        }
    }
}
