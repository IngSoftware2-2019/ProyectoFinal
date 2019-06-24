package com.example.julio.linea72_pasajero.Remote;

import com.example.julio.linea72_pasajero.Model.FCMResponse;
import com.example.julio.linea72_pasajero.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Julio on 20/09/2018.
 */

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA6nRYrtk:APA91bG3HXM7jKyAiVLgiO6zsPg3kj7XDY8VYv49oXLj5X9M1avQj48pJ2ggue89oxRBI_Irp8JrLBOEMFU_j5SySdmQ1qwVJBkrSQ5zgdVl4DWaeB-4IBX9TTJn0bGsunQpjPKjbjk_"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
