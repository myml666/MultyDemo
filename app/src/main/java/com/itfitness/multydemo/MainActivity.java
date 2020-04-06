package com.itfitness.multydemo;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.itfitness.multydemo.adapter.MProviderMultiAdapter;
import com.itfitness.multydemo.beans.TestBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.activity_main_rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        initDatas();
    }

    private void initDatas() {
        List<TestBean> testDatas = getTestDatas();
        MProviderMultiAdapter mProviderMultiAdapter = new MProviderMultiAdapter(testDatas);
        mProviderMultiAdapter.setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() {
            @Override
            public void onItemChildClick(BaseQuickAdapter adapter, View view, int position) {
                int id = view.getId();
                switch (id){
                    case R.id.item_style_one_tv_one:
                        Toast.makeText(MainActivity.this,"我是1",Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_style_two_tv_two:
                        Toast.makeText(MainActivity.this,"我是测试",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        recyclerView.setAdapter(mProviderMultiAdapter);
    }

    private List<TestBean> getTestDatas(){
        ArrayList<TestBean> arrayList = new ArrayList<>();
        for(int i = 0;i<10;i++){
            TestBean testBean = new TestBean();
            testBean.setText1(i+"");
            testBean.setText2(i+"");
            if(i%2==0){
                testBean.setStatus(1);
            }else {
                testBean.setStatus(2);
            }
            arrayList.add(testBean);
        }
        TestBean testBean = new TestBean();
        testBean.setText1("测试");
        testBean.setText2("测试");
        testBean.setStatus(2);
        arrayList.add(testBean);
        return arrayList;
    }
}
