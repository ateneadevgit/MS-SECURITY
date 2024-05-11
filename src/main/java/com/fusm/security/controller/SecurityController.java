package com.fusm.security.controller;

import com.fusm.security.model.BlackListModel;
import com.fusm.security.service.ISecurityService;
import com.fusm.security.util.AppRoutes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Clase que expone los servicios relacionados con la seguridad de la aplicación
 * ITSense Inc - Andrea Gómez
 */

@RestController
@RequestMapping(value = AppRoutes.SECURITY_ROUTE)
public class SecurityController {

    @Autowired
    private ISecurityService securityService;

    /**
     * Válida si una palabra u objeto esta en la black lists de la aplicación
     * @param blackListModel Modelo que permite la validación
     * @return TRUE o FALSE en caso que se encuentre en la lista negra o no
     */
    @PostMapping
    public ResponseEntity<Boolean> hasWordOnBlackList(
            @RequestBody BlackListModel blackListModel
            ) {
        return new ResponseEntity<>(
                securityService.hasWordOnBlackList(blackListModel),
                HttpStatus.OK
        );
    }

}
