package com.github.shiro.chapter.service;

/**
 * 
 * @ClassName: OAuthService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 袁强 
 * @date 2016年3月25日 下午3:17:35 
 *
 */
public interface OAuthService {

    //添加 auth code
    public void addAuthCode(String authCode, String username);
    //添加 access token
    public void addAccessToken(String accessToken, String username);

    //验证auth code是否有效
    boolean checkAuthCode(String authCode);
    //验证access token是否有效
    boolean checkAccessToken(String accessToken);

    String getUsernameByAuthCode(String authCode);
    String getUsernameByAccessToken(String accessToken);


    //auth code / access token 过期时间
    long getExpireIn();


    public boolean checkClientId(String clientId);

    public boolean checkClientSecret(String clientSecret);


}
