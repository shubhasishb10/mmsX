package org.thp.mmsX.security;

import org.springframework.stereotype.Service;

@Service
public class RoleEvaluationResolverService {

    public boolean checkAccessOnRole(){
        return true;
    }
}
