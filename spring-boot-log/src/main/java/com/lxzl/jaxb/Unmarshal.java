package com.lxzl.jaxb;

import java.io.File;
import java.lang.reflect.ParameterizedType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshal<T> {

	public T start(File file) {
		T t = null;
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance((Class < T > ) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[ 0 ]);
            
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            t = (T) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
        return t;
	}
}
