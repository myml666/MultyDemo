package com.itfitness.multydemo.adapter;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.itfitness.multydemo.R;
import com.itfitness.multydemo.beans.TestBean;

import java.util.List;

/**
 * @ProjectName: MultyDemo
 * @Package: com.itfitness.multydemo.adapter
 * @ClassName: MProviderMultiAdapter
 * @Description: java类作用描述
 * @Author: 作者名
 * @CreateDate: 2020/4/6 11:06
 * @UpdateUser: 更新者：itfitness
 * @UpdateDate: 2020/4/6 11:06
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class MProviderMultiAdapter extends BaseMultiItemQuickAdapter<TestBean, BaseViewHolder> {
    public MProviderMultiAdapter(List<TestBean> datas) {
        super(datas);
        // 注册 Provider
        addItemType(ProviderMultiEntity.STYLE_ONE, R.layout.item_style_one);
        addItemType(ProviderMultiEntity.STYLE_TWO, R.layout.item_style_two);
    }

    @Override
    protected void convert(BaseViewHolder helper, TestBean item) {
        switch (helper.getItemViewType()) {
            case ProviderMultiEntity.STYLE_ONE:
                helper.setText(R.id.item_style_one_tv_one,item.getText1());
                helper.setText(R.id.item_style_one_tv_two,item.getText2());
                helper.addOnClickListener(R.id.item_style_one_tv_one);
                break;
            case ProviderMultiEntity.STYLE_TWO:
                helper.setText(R.id.item_style_two_tv_one,item.getText1());
                helper.setText(R.id.item_style_two_tv_two,item.getText2());
                helper.addOnClickListener(R.id.item_style_two_tv_two);
                break;
            default:
                break;
        }
    }


    public class ProviderMultiEntity{
        public static final int STYLE_ONE = 0;//第一种样式
        public static final int STYLE_TWO = 1;//第二种样式
    }
}
