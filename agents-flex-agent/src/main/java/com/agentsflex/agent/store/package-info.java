/*
 * Copyright (c) 2023-2026, Agents-Flex (fuhai999@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 */

/**
 * AgentTurn 状态持久化与版本 CAS 接口。
 *
 * <p>存储实现负责 Snapshot 的乐观锁写入，并持久化停止请求等跨线程控制信号。
 * 默认内存实现适合本地执行和测试；需要跨进程恢复时，应使用数据库或其他共享持久化实现。
 * Agent Store 不会扫描或领取任务，继续执行的时机由业务代码或业务调度器决定。</p>
 */
package com.agentsflex.agent.store;
