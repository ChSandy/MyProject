package com.qf.adpater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.qf.bean.VideoBean;
import com.qf.myproject.R;

import java.util.List;

/**
 * Created by Administrator on 2016/12/14.
 */

public class MyAdapter extends BaseAdapter {
    private List<VideoBean.DataBean.ItemBean> datas;
    private LayoutInflater inflater;
    private Context context;

    public MyAdapter(Context context, List<ImageView> datas) {
        this.context = context;
       // this.datas = datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return datas.size();
    }

    @Override
    public Object getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_three_layout, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();

        }
        VideoBean.DataBean.ItemBean bean = datas.get(position);

        Glide.with(context).load(bean.getImage()).into(holder.imageView);
        holder.title.setText(bean.getTitle());
        holder.tv_tuiguang.setText(bean.getCategory());
        holder.tv_pl.setText(bean.getPl());

        return convertView;
    }

    class ViewHolder {
        private ImageView imageView;
        private TextView title;
        private TextView tv_tuiguang;
        private TextView tv_pl;

        public ViewHolder(View view) {
            imageView = (ImageView) view.findViewById(R.id.iv_three);
            title = (TextView) view.findViewById(R.id.tv_tree_title);
            tv_tuiguang = (TextView) view.findViewById(R.id.tv_three_tuiguang);
            tv_pl = (TextView) view.findViewById(R.id.tv_three_pl);
        }
    }
}
