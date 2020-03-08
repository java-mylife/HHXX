package com.course.httpclient.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class yyyy {
    @Test
    public void test01() throws Exception {
        String res ;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://wwww.baidu.com");
        CloseableHttpResponse response =httpClient .execute(httpGet);
        res = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(res);
        try{
            System.out.println(response);
        }catch (Exception e ){

        }finally {
            response.close();
        }
    }

    public static void main(String[] args) {
        JSONObject param = new JSONObject();
        param.put("iconLink", 1);
        param.put("unlockMemberLever", 2);

        JSONArray welfareDetails = new JSONArray();
        JSONObject jsonObject = new JSONObject();

        JSONArray coupons = new JSONArray();
        JSONObject coupons1 = new JSONObject();
        coupons1.put("couponId", 1);
        coupons1.put("numbers", 1);
        JSONObject coupons2 = new JSONObject();
        coupons2.put("couponId", 2);
        coupons2.put("numbers", 1);
        coupons.add(coupons1);
        coupons.add(coupons2);

        jsonObject.put("coupons", coupons);
        jsonObject.put("welfareType", 2);


        welfareDetails.add(jsonObject);

        param.put("welfareDetails", welfareDetails);
        param.put("welfareExplain", 11);
        param.put("welfareName", 22);
        System.out.println(param);


        String[] goodsIds = {"111","222","333"};
        JSONArray jsonArray = new JSONArray();
        List<String > list = Arrays.asList(goodsIds);
        jsonArray.add(list);
        System.out.println(list);

        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("unlockMemberLever",2);
        jsonObject1.put("iconLink",1);
        jsonObject1.put("welfareExplain",11);
        jsonObject1.put("welfareName",22);

        JSONArray jsonArray1 = new JSONArray();
        JSONObject jsonObject2 = new JSONObject();

        jsonObject2.put("welfareType",2);
        jsonObject2.put("coupons",jsonArray);

        JSONArray jsonArray2 = new JSONArray();

        JSONObject jsonObject3 = new JSONObject();
        jsonObject2.put("numbers",1);
        jsonObject2.put("couponId",1);
        JSONObject jsonObject4 = new JSONObject();
        jsonObject3.put("numbers",2);
        jsonObject3.put("couponId",2);

//        JSONObject jsonObject5 = new JSONObject();
//        jsonObject5.fluentPut("11",111)
//                .fluentPut()

        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.fluentPut("activityId",1)
                .fluentPut("activityName","activityName")
                .fluentPut("backgroundPicId",2)
                .fluentPut("beginTime","2019-10-02 09:12:21")
                .fluentPut("endTime","2019-10-02 09:12:21")
                .fluentPut("entrancePicId",1)
                .fluentPut("excellenceTimes",2)
                .fluentPut("excellentAwardConfig",new JSONObject()
                        .fluentPut("awardAttr","普通奖")
                        .fluentPut("awardId",0)
                        .fluentPut("awardLevel","四等奖")
                        .fluentPut("awardName","xxxx")
                        .fluentPut("awardType",1)
                        .fluentPut("couponId",1)
                        .fluentPut("goodsId",1)
                        .fluentPut("integralCount",20)
                        .fluentPut("redPacketAmount",108)
                        .fluentPut("totalStock",1000))
                .fluentPut("passedAwardConfig",new JSONObject()
                        .fluentPut("awardAttr","普通奖")
                        .fluentPut("awardId",0)
                        .fluentPut("awardLevel","四等奖")
                        .fluentPut("awardName","xxxx")
                        .fluentPut("awardType",1)
                        .fluentPut("couponId",1)
                        .fluentPut("goodsId",1)
                        .fluentPut("integralCount",20)
                        .fluentPut("redPacketAmount",108)
                        .fluentPut("totalStock",1000))
                .fluentPut("picCountEveryUpload",2)
                .fluentPut("regions","['1','2']")
                .fluentPut("regionsLevel",2)
                .fluentPut("ruleIntro","xxxx")
                .fluentPut("solutionId","111")
                .fluentPut("targetType",1)
                .fluentPut("targets",2)
                .fluentPut("uploadTimesPerWeek",4);
        System.out.println(jsonObject6);


        JSONObject param1 = new JSONObject();
        param1.fluentPut("bigLevelId",1)
                .fluentPut("exp",1)
                .fluentPut("levelName",1)
                .fluentPut("iconLink",1);
        System.out.println("param1："+param1);

    }

}