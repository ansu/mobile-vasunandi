
package com.jain.vasunandisant.injection.component;

import com.jain.vasunandisant.injection.PerService;
import com.jain.vasunandisant.injection.module.ServiceModule;

import dagger.Component;

/**
 * Created by @iamBedant on 15/03/17.
 */

@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {


}
