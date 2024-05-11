package com.fusm.security.service;

import com.fusm.security.model.BlackListModel;
import org.springframework.stereotype.Service;

@Service
public interface ISecurityService {
    Boolean hasWordOnBlackList(BlackListModel blackListModel);
}
