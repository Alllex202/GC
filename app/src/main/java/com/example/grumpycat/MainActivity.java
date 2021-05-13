package com.example.grumpycat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new GrumpyCatAdapter(generateCats());
        recyclerView.setAdapter(adapter);
    }

    private static List<GrumpyCat> generateCats() {
        List<GrumpyCat> grumpyCats = new ArrayList<>();
        grumpyCats.add(new GrumpyCat("123", "https://media.wired.com/photos/5cdefb92b86e041493d389df/1:1/w_988,h_988,c_limit/Culture-Grumpy-Cat-487386121.jpg"));
        grumpyCats.add(new GrumpyCat("234", "https://f8n-ipfs-production.imgix.net/QmfWtxAM2qwKrEXVoeasArDBrR12qL7HCuD2B4Tqe5R8Bs/nft.jpg?fit=fill&q=100&w=2560"));
        grumpyCats.add(new GrumpyCat("345", "https://im.kommersant.ru/Issues.photo/RADIO/2019/05/17/KMO_147478_00896_1_t218_214229.jpg"));
        grumpyCats.add(new GrumpyCat("46asd", "https://yt3.ggpht.com/ytc/AAUvwnh3Uru77lrw_kODYhp4B8TbdFiQI1NzVFpIoIPE3g=s900-c-k-c0x00ffffff-no-rj"));
        grumpyCats.add(new GrumpyCat("5вап7", "https://static.dw.com/image/18463014_101.jpg"));
        grumpyCats.add(new GrumpyCat("67п8", "https://cdn.cnn.com/cnnnext/dam/assets/190517103414-01-grumpy-cat-file-restricted.jpg"));
        grumpyCats.add(new GrumpyCat("7вап89", "https://cdn24.img.ria.ru/images/103713/68/1037136840_0:112:2001:1237_600x0_80_0_0_38875352d9b49dce8ca0649cc521a804.jpg"));
        grumpyCats.add(new GrumpyCat("890", "https://media.wired.com/photos/5cdefb92b86e041493d389df/1:1/w_988,h_988,c_limit/Culture-Grumpy-Cat-487386121.jpg"));
        grumpyCats.add(new GrumpyCat("qwe", "https://f8n-ipfs-production.imgix.net/QmfWtxAM2qwKrEXVoeasArDBrR12qL7HCuD2B4Tqe5R8Bs/nft.jpg?fit=fill&q=100&w=2560"));
        grumpyCats.add(new GrumpyCat("asd", "https://im.kommersant.ru/Issues.photo/RADIO/2019/05/17/KMO_147478_00896_1_t218_214229.jpg"));
        grumpyCats.add(new GrumpyCat("zxc", "https://yt3.ggpht.com/ytc/AAUvwnh3Uru77lrw_kODYhp4B8TbdFiQI1NzVFpIoIPE3g=s900-c-k-c0x00ffffff-no-rj"));
        grumpyCats.add(new GrumpyCat("wer", "https://static.dw.com/image/18463014_101.jpg"));
        grumpyCats.add(new GrumpyCat("sdf", "https://cdn.cnn.com/cnnnext/dam/assets/190517103414-01-grumpy-cat-file-restricted.jpg"));
        grumpyCats.add(new GrumpyCat("xcv", "https://cdn24.img.ria.ru/images/103713/68/1037136840_0:112:2001:1237_600x0_80_0_0_38875352d9b49dce8ca0649cc521a804.jpg"));
        return grumpyCats;
    }
}