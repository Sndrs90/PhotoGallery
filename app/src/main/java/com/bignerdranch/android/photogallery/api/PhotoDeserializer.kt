package com.bignerdranch.android.photogallery.api

import com.google.gson.Gson
import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.reflect.Type

class PhotoDeserializer : JsonDeserializer<PhotoResponse> {

    lateinit var photos : PhotoResponse

    override fun deserialize(
        json: JsonElement,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): PhotoResponse {
        // Вытяните объект фотографий из JsonElement
        // и преобразуйте его в объект PhotoResponse
        val photosJsonObject = json.asJsonObject
        return Gson().fromJson(photosJsonObject, PhotoResponse::class.java)

    }
}