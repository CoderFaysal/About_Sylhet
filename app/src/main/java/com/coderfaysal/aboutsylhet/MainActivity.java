package com.coderfaysal.aboutsylhet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {


    RecyclerView it_recycle;
    HashMap<String, String> hashMap;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        it_recycle = findViewById(R.id.it_recycle);

        Sylhet();

        MyAdapter myAdapter = new MyAdapter();
        it_recycle.setAdapter(myAdapter);
        it_recycle.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }



    public void Sylhet(){

        hashMap = new HashMap<>();
        hashMap.put("title", "সিলেট");
        hashMap.put("desc", "সিলেট উত্তর-পূর্ব বাংলাদেশের একটি প্রধান শহর, একই সাথে এই শহরটি সিলেট বিভাগের বিভাগীয় শহর। এটি সিলেট জেলার অন্তর্গত। সিলেট সিটি কর্পোরেশনের আওতাধীন এলাকাই মূলত সিলেট শহর হিসেবে পরিচিত। সিলেট ২০০৯ সালের মার্চ মাসে একটি মেট্রোপলিটন শহরের মর্যাদা লাভ করে।[১] সুরমা নদীর তীরবর্তী এই শহরটি বাংলাদেশের অন্যতম গুরুত্বপূর্ণ শহর। প্রাকৃতিক সৌন্দর্যমণ্ডিত এ শহরটি দেশের আধ্যাত্মিক রাজধানী হিসেবে খ্যাত। সিলেট অর্থনৈতিকভাবে বাংলাদেশের সবচেয়ে সমৃদ্ধ জেলা হিসেবে পরিচিত। শিল্প, প্রাকৃতিক সম্পদ ও অর্থনৈতিক ভাবে সিলেট দক্ষিণ এশিয়ার অন্যতম ধনী জেলা। এ শহরের বিশাল সংখ্যক লোক পৃথিবীর বিভিন্ন দেশে বসবাস করে প্রচুর বৈদেশিক মুদ্রা প্রেরণ করে দেশের অর্থনীতিতে বিশেষ ভূমিকা পালন করে আসছে।[৩] সিলেটের পাথর, বালুর গুণগতমান দেশের মধ্যে শ্রেষ্ঠ। এখানকার প্রাকৃতিক গ্যাস সারা দেশের সিংহভাগ চাহিদা পূরণ করে থাকে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "নামকরণ");
        hashMap.put("desc", "বাংলা ও আঞ্চলিক সিলটি ভাষায় প্রাচীনকাল থেকেই সিলেটকে শ্রীহট্ট নামে ডেকে আসা হয়েছে। কিন্তু শ্রীহট্ট নামের উৎস নিয়েও রয়েছে ব্যাপক অস্পষ্টতা। এর সাথে হিন্দু পৌরাণিক আখ্যানের প্রভাব জড়িত থাকতে পারে বলে ধারণা করা হয়। হিন্দু পুরাণ অনুযায়ী শ্রী শ্রী হাটকেশ্বর হচ্ছে মহাদেব শিবের বহু নামের অন্যতম। তৎকালীন গৌড় (শ্রীহট্ট) রাজাদের কর্তৃক পুজিত শ্রী হাটকেশ্বরই শ্রীহট্ট নামের উৎস বলে অনেকে মনে করেন।[৪] আবার হিন্দুদেবী লক্ষ্মীর আরেক নাম শ্রী, বর্তমান সিলেট শহরের অনতিদূরে দেবী মহালক্ষ্মীর একটি সুপ্রসিদ্ধ মন্দিরও রয়েছে, যেটি আবার সতীপীঠের মধ্যেও অন্যতম, অতএব, শ্রীহট্ট নামটি শ্রী-এর হাট (অর্থাৎ বাজার) থেকেও হতে পারে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "ইতিহাস");
        hashMap.put("desc", "ইতিহাসবিদেরা বলেন, বহুযুগ ধরে সিলেট একটি বাণিজ্যিক শহর হিসেবে প্রচলিত আছে। ধারণা করা হয়ে থাকে যে, হরিকেল রাজত্বের মূল ভূখণ্ড ছিল এই সিলেট। চতুর্দশ শতকের দিকে এই অঞ্চলে ইসলামি প্রভাব দেখা যায় সুফী দার্শনিকদের আগমনের মাধ্যমে। ১৩০৩ সালে কালৈতিহাসিক মুসলিম ধর্মপ্রচারক হযরত শাহ জালাল রহ.-এর আবির্ভাব ঘটে এই সময়ে। তিনি মক্কা থেকে দিল্লি ও ঢাকা হয়ে এই এলাকায় আসেন। তার আধ্যাত্মিক ক্ষমতার প্রভাবে ও তার অনুসারী ৩৬০ জনের মাধ্যমে আরও অনেকেই ইসলাম ধর্ম গ্রহণ করে। পরবর্তীতে তা দেশের অন্যত্র ও ছড়িয়ে পড়ে। তার দরগাহ সিলেটের একটি অন্যতম দর্শনীয় স্থান হিসেবে বিবেচিত হয়।একসময় তার নামানুসারে এ অঞ্চল জালালাবাদ নামে পরিচিত হয়। হযরত শাহ্ পরান ও শাহ্ কামাল কাহাফানের সান্নিধ্যে এসেও অনেকে বৌদ্ধ ও হিন্দু ধর্ম থেকে ইসলাম ধর্মে ধর্মান্তরিত হয়েছিল। ব্রিটিশ ইস্ট ইন্ডিয়া কোম্পানি এর শাসনামলে ইন্ডিয়ান লস্করেরা এই এলাকায় তাঁবেদারি শাসন চালাতো।[৫] ১৭৭৮ সালে রবার্ট লিন্ডসে কে সিলেটের দায়ভার দেয়া হয়। তবে তখনকার স্থানীয় সিলেটিরা তাকে ভালোভাবে নেয় নি। ১৭৮১ সালে এই এলাকায় একটি বড় ধরনের বন্যা হয়েছিল। এতে অসংখ্য ফসল ও পাখি মারা যায়। স্থানীয়রা এজন্য ব্রিটিশদের দায়ী করে। এই আন্দোলনে মুখ্য ভূমিকা পালন করেন সৈয়দ হাদী ও সৈয়দ মাহাদী (পীরজাদা নামে পরিচিত)। লিন্ডসের সাথে তখন তাদের যুদ্ধ সংঘটিত হয় যাতে প্রচুর ভারতীয় তস্কর অংশ নেয়। ফলশ্রুতিতে অনেকেই সিলেট ছেড়ে লন্ডনে চলে যায় ও বসতি গড়ে তোলে। ব্রিটিশ শাসনের সময় আসাম ও সিলেট একত্রিত হয়ে আসামের অংশ ছিল। পরবর্তীতে ভারত ও পাকিস্তান আলাদা দেশ গঠনের সময় আসাম ও সিলেট আলাদা হয়ে যায়। ১৯৭১-এর যুদ্ধে জয়লাভের পর এটি পূর্ব পাকিস্তান তথা বাংলাদেশ-এর ভূখণ্ডে পড়ে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "শিক্ষা");
        hashMap.put("desc", "শিক্ষাক্ষেত্রে সিলেটের রয়েছে এক সমৃদ্ধ ইতিহাস। এ শহরে সাক্ষরতার হার প্রায় ৬৭.৬%। এখানে রয়েছে শত বছরের ঐতিহ্যমণ্ডিত মুরারিচাঁদ কলেজ। প্রাথমিক ও মাধ্যমিক স্তরের শিক্ষা প্রদানের জন্য সরকারি বেসরকারি অনেকগুলো প্রতিষ্ঠান রয়েছে। এগুলোর মধ্যে সিলেট সরকারি পাইলট উচ্চ বিদ্যালয় ও সরকারি অগ্রগামী বালিকা উচ্চ বিদ্যালয় অন্যতম। উচ্চ মাধ্যমিক এবং অনার্স স্তরের জন্য এখানে রয়েছে সিলেট সরকারি কলেজ, সিলেট সরকারি মহিলা কলেজ, সিলেট বিজ্ঞান ও প্রযুক্তি কলেজ , সিলেট সরকারি আলিয়া মাদ্রাসা সহ আরও অনেক কলেজ এবং মাদ্রাসা। উচ্চতর শিক্ষার জন্য রয়েছে সিলেট সরকারি পলিটেকনিক ইনস্টিটিউট, সিলেট, সিলেট কৃষি বিশ্ববিদ্যালয়, শাহজালাল বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়, সিলেট ইন্টারন্যাশনাল ইউনিভার্সিটি এবং সিলেট ইঞ্জিনিয়ারিং কলেজ।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "দর্শনীয় স্থানসমূহ");
        hashMap.put("desc", "হযরত শাহজালালের দরগাহ\nশাহী ঈদগাহ\nশাহ পরাণের মাজার\nগাজী বুরহান উদ্দীনের মাজার\nক্বীন ব্রীজ\nআলী আমজদের ঘড়ি\nমালনি ছড়া চা বাগান\nমুরারিচাঁদ কলেজ\nশাহজালাল বিজ্ঞান ও প্রযুক্তি বিশ্ববিদ্যালয়\nমিউজিয়াম অব রাজাস\nটিলাগড় ইকোপার্ক\nজালালাবাদ রাগীব-রাবেয়া মেডিকেল কলেজ\nজিতু মিয়ার বাড়ী\nজাফলং\nশীমঙ্গল চা বাগান");
        arrayList.add(hashMap);


    }


    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            LayoutInflater layoutInflater = getLayoutInflater();
            View view = layoutInflater.inflate(R.layout.items, parent, false);

            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String name = hashMap.get("title");
            String dec = hashMap.get("desc");

            holder.it_name.setText(name);

            holder.click_lay.setOnClickListener(view -> {

                Details.TITLE = name;
                Details.DESC = dec;
                startActivity(new Intent(MainActivity.this, Details.class));

            });

        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class MyViewHolder extends RecyclerView.ViewHolder{

            LinearLayout click_lay;
            TextView it_name;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                click_lay = itemView.findViewById(R.id.click_lay);
                it_name = itemView.findViewById(R.id.it_name);


            }
        }

    }


}