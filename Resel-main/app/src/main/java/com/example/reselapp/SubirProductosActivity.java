package com.example.reselapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class SubirProductosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subir_productos);
    }

    public void publicarProducto (){
        Activity activity = this;
        JsonArrayRequest request = new JsonArrayRequest(
                Request.Method.POST,
                "https://625fc4f053a42eaa07fa9583.mockapi.io/:endpoint",
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        List<SubirProductoData> allTheData = new ArrayList<>();
                        for (int i = 0; i < response.length(); i++){
                            try{
                                JSONObject prenda = response.getJSONObject(i);
                                SubirProductoData data = new SubirProductoData(prenda);
                                allTheData.add(data);
                            }catch (JSONException e){
                                e.printStackTrace();
                            }

                        }

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(activity, "Error", Toast.LENGTH_SHORT).show();
                    }
                });
        RequestQueue cola = Volley.newRequestQueue(this);
        cola.add(request);
    }


}