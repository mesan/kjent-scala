#!/bin/sh
java -Dfile.encoding=utf8 -Xmx1024M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -jar `dirname $0`/sbt-launch.jar "$@"
