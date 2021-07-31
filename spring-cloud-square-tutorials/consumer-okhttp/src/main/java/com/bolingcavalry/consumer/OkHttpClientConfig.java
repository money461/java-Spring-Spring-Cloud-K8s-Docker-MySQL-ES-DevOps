package com.bolingcavalry.consumer;

import okhttp3.OkHttpClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaoqin1(zhaoqin1 @ sensetime.com)
 * @Title:
 * @Package
 * @Description:
 * @date 7/30/21 11:16 下午
 */
@Configuration
class OkHttpClientConfig{
    @Bean
    @LoadBalanced
    public OkHttpClient.Builder okHttpClientBuilder() {
        return new OkHttpClient.Builder();
    }
}