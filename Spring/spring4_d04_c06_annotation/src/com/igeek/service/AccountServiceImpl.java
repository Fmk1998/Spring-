package com.igeek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.igeek.dao.IAccountDao;

//���ղ�����ҵ���
/**
* @Service("accountService")
* �൱��spring�����ж��壺<bean id="accountService" class="com.igeek.anntx.service.AccountServiceImpl">
*/
@Service("accountService")
@Transactional(readOnly=true)//��Ը����У����еĹ��еķ������Զ���������--ȫ�ֵ����ã�Ĭ���ǿ�д
public class AccountServiceImpl implements IAccountService{
	
	//ע��dao
	@Autowired
	private IAccountDao accountDao;

	//ת�˲�����ҵ���߼�
	@Transactional(readOnly=false)//�ڷ������������
	public void transfer(String outName,String inName,Double money){
		
		//����dao��
		//��ȡ��
		accountDao.out(outName, money);
		int d = 1/0;
		//��ת��
		accountDao.in(inName, money);

	}
	
	@Transactional()//ʹ�þֲ�����ȫ�ֵ�
	public void findAccount(){
		System.out.println("��ѯ�ʺŵ���Ϣ��");
	}

}