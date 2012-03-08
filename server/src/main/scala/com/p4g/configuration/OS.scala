package com.p4g.configuration

/**
 * @author yoeight - Y. Laupa
 *
 */
sealed trait OS

case object OSX extends OS
case object Window extends OS
case object Linux extends OS