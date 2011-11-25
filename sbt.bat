@echo off

rem PATH=c:\jdk6\bin;%PATH%

set SCRIPT_DIR=%~dp0
java -Xmx1024M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=256m -jar "%SCRIPT_DIR%sbt-launch.jar" %*
