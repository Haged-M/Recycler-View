package com.o_t.rycyclerview.kotlin

import com.o_t.rycyclerview.Contact

interface OnContactClickListener {
    fun onContactClick(contact: Contact?, position: Int)
}
