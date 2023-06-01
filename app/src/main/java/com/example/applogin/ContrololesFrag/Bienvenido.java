package com.example.applogin.ContrololesFrag;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.applogin.Inicio;
import com.example.applogin.MainActivity;
import com.example.applogin.R;

import java.util.ArrayList;

public class Bienvenido extends Fragment {

    //Para el WhatsApp
    //private final String urlWa = "https://api.whatsapp.com/send/?phone=50233302359&text&type=phone_number&app_absent=0";
    Button whats;

    ImageSlider imageSlider;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {
        //ENvio de mensajes

        View view = inflater.inflate(R.layout.fragment_bienvenido,container,false);



        imageSlider =  view.findViewById(R.id.imgslider);

        ArrayList<SlideModel> imageList = new ArrayList<>();

        imageList.add(new SlideModel(R.drawable.ropero, ScaleTypes.FIT));
        imageList.add(new SlideModel("https://www.steren.com.gt/media/catalog/product/cache/532829604b379f478db69368d14615cd/image/169369b16/teclado-usb.jpg",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://media.admagazine.com/photos/63643d86181bc087f601b9e0/16:9/w_2560%2Cc_limit/tempo_ad_mueble.jpg",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://blog.mueblesfiesta.com/hs-fs/hubfs/Blogs/Blog-Muebles-Fiesta-Muebles-para-tu-television-que-puedes-encontrar-en-Muebles-Fiesta.jpeg",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://i0.wp.com/elpuentecomercial.com/wp-content/uploads/2021/05/16247.jpg?resize=1024%2C673&ssl=1",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://www.sony.com.gt/image/d4f672c8c1b08401c3fb67cce747b7db?fmt=pjpeg&wid=330&bgcolor=FFFFFF&bgc=FFFFFF",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://www.sony.com.gt/image/de1537232b3c8d6aca5aa94c10801f7a?fmt=pjpeg&wid=1014&hei=396&bgcolor=F1F5F9&bgc=F1F5F9",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://walmartgt.vtexassets.com/arquivos/ids/258503/Teclado-Hyperx-Alloy-Mecanico-Ultra-Comp-1-49082.jpg?v=637838634015170000",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel("https://acortar.link/8NLOoS",ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.sala, ScaleTypes.FIT));

        imageSlider.setImageList(imageList);
        return view;


    }



}