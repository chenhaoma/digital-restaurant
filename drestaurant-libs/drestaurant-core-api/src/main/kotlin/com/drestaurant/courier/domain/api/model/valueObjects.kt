package com.drestaurant.courier.domain.api.model

import java.util.*

enum class CourierOrderState {
    CREATED, ASSIGN_PENDING, ASSIGNED, DELIVERED, CANCEL_PENDING, CANCELLED
}

data class CourierId(val identifier: String) {
    constructor() : this(UUID.randomUUID().toString())

    override fun toString(): String = identifier
}

data class CourierOrderId(val identifier: String) {
    constructor() : this(UUID.randomUUID().toString())

    override fun toString(): String = identifier
}
