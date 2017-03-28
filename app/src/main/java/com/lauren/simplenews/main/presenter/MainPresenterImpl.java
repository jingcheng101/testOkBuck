package com.lauren.simplenews.main.presenter;

import com.lauren.simplenews.R;
import com.lauren.simplenews.main.view.MainView;
/**
 * Description :
 * Author : lauren
 * Email  : lauren.liuling@gmail.com
 * Blog   : http://www.liuling123.com
 * Date   : 15/12/13
 */
public class MainPresenterImpl implements MainPresenter {

    private MainView mMainView;

    public MainPresenterImpl(MainView mainView) {
        this.mMainView = mainView;
    }

    @Override
    public void switchNavigation(int id) {

//        switch (id){
//            case R.id.navigation_item_news:
//                mMainView.switch2News();
//                break;
//            case R.id.navigation_item_images:
//                mMainView.switch2Images();
//                break;
//            case R.id.navigation_item_weather:
//                mMainView.switch2Weather();
//                break;
//            case R.id.navigation_item_about:
//                mMainView.switch2About();
//                break;
//            default:
//                mMainView.switch2News();
//                break;
//        }
        if(id == R.id.navigation_item_news){
            mMainView.switch2News();
        }else if(id == R.id.navigation_item_images){
            mMainView.switch2Images();
        }else if(id == R.id.navigation_item_weather){
            mMainView.switch2Weather();
        }else if(id == R.id.navigation_item_about){
            mMainView.switch2About();
        }else{
            mMainView.switch2News();
        }
    }
}



