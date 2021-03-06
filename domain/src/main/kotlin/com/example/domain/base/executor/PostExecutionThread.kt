package com.example.domain.base.executor

import io.reactivex.Scheduler


/**
 * @author Aldyaz Nugroho on 01/06/20.
 * https://github.com/aldyaz
 */
interface PostExecutionThread {
    val scheduler: Scheduler
}