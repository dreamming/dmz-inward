package net.frontnode.openapi;

import com.alibaba.fastjson.JSONArray;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmz on 2016/7/11.
 */
public class GsonTest {
    public static void main(String[] arg) {
        String str="[{\"name\":\"工商银行\",\"paymentType\":\"bank:002\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"农业银行\",\"paymentType\":\"bank:003\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"中国银行\",\"paymentType\":\"bank:004\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"建设银行\",\"paymentType\":\"bank:005\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"交通银行\",\"paymentType\":\"bank:006\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"招商银行\",\"paymentType\":\"bank:007\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"中信银行\",\"paymentType\":\"bank:009\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"兴业银行\",\"paymentType\":\"bank:012\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"光大银行\",\"paymentType\":\"bank:013\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"民生银行\",\"paymentType\":\"bank:014\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"上海银行\",\"paymentType\":\"bank:016\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"平安银行\",\"paymentType\":\"bank:017\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null},{\"name\":\"华夏银行\",\"paymentType\":\"bank:019\",\"maxRapidPayAmountPerTxn\":\"99999999.00\",\"maxRapidPayAmountPerDay\":\"999999999.00\",\"maxRapidPayAmountPerMonth\":\"9999999999.00\",\"maxRapidPayTxnCountPerDay\":null}]";
        List<PaymentProvider> providers = JSONArray.parseArray(str, PaymentProvider.class);
        System.out.println(providers);
        Gson gson = new GsonBuilder().create();

        List<PaymentProvider> rs=new ArrayList<PaymentProvider>();

        Type type = new TypeToken<ArrayList<PaymentProvider>>() {}.getType();

        List<PaymentProvider> pro = gson.fromJson(str, type);
        System.out.println(pro);

    }
}

