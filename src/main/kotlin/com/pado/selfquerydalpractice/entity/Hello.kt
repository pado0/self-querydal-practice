package com.pado.selfquerydalpractice.entity

import javax.persistence.*

@Entity
@Table(name = "hello_table")
class Hello(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val greeting: String,

)