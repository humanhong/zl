package com.zl.pojo;

import java.io.Serializable;

import lombok.Data;

@Data
public class Account implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
    private String pass;
}
