/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author Dario
 */
public class ModelMapperConfig {
    @Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
