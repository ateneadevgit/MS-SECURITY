package com.fusm.security.service.impl;

import com.fusm.security.entity.Security;
import com.fusm.security.model.BlackListModel;
import com.fusm.security.repository.ISecurityRepository;
import com.fusm.security.service.ISecurityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityService implements ISecurityService {

    @Autowired
    private ISecurityRepository securityRepository;

    Logger logger = LoggerFactory.getLogger(SecurityService.class);

    @Override
    public Boolean hasWordOnBlackList(BlackListModel blackListModel) {
        logger.error("Hola como estas jijijiji");
        List<String> wordsOnBlackList = securityRepository.findByIsHtml(blackListModel.getIsHtml())
                .stream().map(Security::getWord).toList();
        boolean isOnBlackList = wordsOnBlackList.stream()
                .noneMatch(word ->
                        blackListModel.getWord().toLowerCase().contains(word.toLowerCase())
                );
        if (!isOnBlackList) logger.error("Word or text { " + blackListModel.getWord() + " } is on black list");
        return isOnBlackList;
    }

}
