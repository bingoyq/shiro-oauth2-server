package com.github.shiro.chapter.service;

import java.util.List;

import com.github.shiro.chapter.entity.Client;

/**
 * 
 * @ClassName: ClientService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 袁强 
 * @date 2016年3月25日 下午3:17:25 
 *
 */
public interface ClientService {

    public Client createClient(Client client);
    public Client updateClient(Client client);
    public void deleteClient(Long clientId);

    Client findOne(Long clientId);

    List<Client> findAll();

    Client findByClientId(String clientId);
    Client findByClientSecret(String clientSecret);

}
