package com.personal.blog.utils;

import com.personal.blog.model.UserModel;
import org.springframework.security.core.context.SecurityContextHolder;

public class CurrentUser {
    public static String resolve(){
        return ((UserModel) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getEmail();
    }
}
