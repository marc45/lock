/* 
 * Copyright chinesejie    
 *    
 */
package com.demo.lock;

/**
 * <p>
 * TODO (用一句话描述该文件做什么)   
 *</p>
 * @author chinesejie <br/>
 */
public interface LockListener {

	public void lockReleased();

	void lockAcquired();

	long getExpire();

	void lockError();

}
