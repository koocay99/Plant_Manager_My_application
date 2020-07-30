package com.example.myapplication;
import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.CustomViewHolder> {
    private ArrayList<PersonalData> mList = null;
    private Activity context = null;


    public UsersAdapter(Activity context, ArrayList<PersonalData> list) {
        this.context = context;
        this.mList = list;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView num;
        protected TextView temp;
        protected TextView humi;
        protected TextView Soil_mos;
        protected TextView Light;
        protected TextView UploadTime;


        public CustomViewHolder(View view) {
            super(view);
            this.num = (TextView) view.findViewById(R.id.textView_list_num);
            this.temp = (TextView) view.findViewById(R.id.textView_list_temp);
            this.humi = (TextView) view.findViewById(R.id.textView_list_humi);
            this.Soil_mos = (TextView) view.findViewById(R.id.textView_list_Soil_mos);
            this.Light = (TextView) view.findViewById(R.id.textView_list_Light);
            this.UploadTime = (TextView) view.findViewById(R.id.textView_list_UploadTime);
        }
    }


    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, null);
        CustomViewHolder viewHolder = new CustomViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder viewholder, int position) {

        viewholder.num.setText(mList.get(position).getMember_num());
        viewholder.temp.setText(mList.get(position).getMember_temp());
        viewholder.humi.setText(mList.get(position).getMember_humi());
        viewholder.Soil_mos.setText(mList.get(position).getMember_Soil_mos());
        viewholder.Light.setText(mList.get(position).getMember_Light());
        viewholder.UploadTime.setText(mList.get(position).getMember_UploadTime());

    }

    @Override
    public int getItemCount() {
        return (null != mList ? mList.size() : 0);
    }
}
