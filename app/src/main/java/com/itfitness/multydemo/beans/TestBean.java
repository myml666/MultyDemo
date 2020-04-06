package com.itfitness.multydemo.beans;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.itfitness.multydemo.adapter.MProviderMultiAdapter;

/**
 * @ProjectName: MultyDemo
 * @Package: com.itfitness.multydemo.beans
 * @ClassName: TestBean
 * @Description: java类作用描述
 * @Author: 作者名
 * @CreateDate: 2020/4/6 11:07
 * @UpdateUser: 更新者：itfitness
 * @UpdateDate: 2020/4/6 11:07
 * @UpdateRemark: 更新说明：
 * @Version: 1.0
 */
public class TestBean implements MultiItemEntity {
    private int status;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private String text1;
    private String text2;

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    @Override
    public int getItemType() {
        switch (status){
            case 1:
                return MProviderMultiAdapter.ProviderMultiEntity.STYLE_ONE;
            case 2:
                return MProviderMultiAdapter.ProviderMultiEntity.STYLE_TWO;
        }
        return 0;
    }
}
