package com.example.julio.linea72_pasajero.Common;

import com.example.julio.linea72_pasajero.Model.Rider;
import com.example.julio.linea72_pasajero.Remote.FCMClient;
import com.example.julio.linea72_pasajero.Remote.IFCMService;

/**
 * Created by Julio on 19/09/2018.
 */

public class Common {
    public static final String driver_tbl = "Conductores";
    public static final String user_driver_tbl = "Usuarios";
    public static final String user_rider_tbl = "Usuarios";
    public static final String rider_tbl = "Pasajeros";
    /*public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static final int PICK_IMAGE_REQUEST = 9999;*/

    public static Rider currentUser;

    //public static Location mLastLocation = null;

    public static  final String fcmURL = "https://fcm.googleapis.com/";

    public static IFCMService getFCMService(){
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }

}
