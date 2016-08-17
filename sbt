java -Xmx512M -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled -XX:PermSize=256M -XX:MaxPermSize=512M -jar $SBT_HOME/sbt-launch-$SBT_VERSION.jar "$@"
