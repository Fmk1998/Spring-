package com.igeek;

import org.springframework.beans.factory.FactoryBean;

//4��ʵ��FactoryBean�ӿڵķ�ʽ
//���ͣ���Ҫ����ʲô���͵Ķ��󣬷��;���ʲô
public class Bean4FactoryBean implements FactoryBean<Bean4>{

	@Override
	public Bean4 getObject() throws Exception {
		//дһЩ��ʼ�����ݿ����ӵȵ���������
		return new Bean4();
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return false;
	}

}
