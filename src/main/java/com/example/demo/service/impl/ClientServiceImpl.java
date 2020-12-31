package com.example.demo.service.impl;

import com.example.demo.entity.Client;
import com.example.demo.mapper.ClientMapper;
import com.example.demo.service.IClientService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hyh
 * @since 2020-12-31
 */
@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements IClientService {

}
