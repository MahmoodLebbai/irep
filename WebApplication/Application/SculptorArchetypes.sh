if [ -z $1 ] || [ -z $2 ]; then
   echo -e "Usage: $0 PACKAGEID ARTIFACTID\n\tPACKAGEID - name of Java package, for example org.helloworld"
   echo -e "\tARTIFACTID - project base name, for example helloworld"
   exit 1
fi

PACKAGE=$1
SYS_NAME=$2

mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=fornax-cartridges-sculptor-archetype-parent -DarchetypeVersion=2.1.0-SNAPSHOT -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public -DgroupId=$PACKAGE -DartifactId=$SYS_NAME-parent -Dpackage=$PACKAGE -Dversion=1.0-SNAPSHOT

mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=fornax-cartridges-sculptor-archetype -DarchetypeVersion=2.1.0-SNAPSHOT -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public -DgroupId=$PACKAGE -DartifactId=$SYS_NAME -Dpackage=$PACKAGE -Dversion=1.0-SNAPSHOT

mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.fornax.cartridges -DarchetypeArtifactId=fornax-cartridges-sculptor-archetype-jsf -DarchetypeVersion=2.1.0-SNAPSHOT -DarchetypeRepository=http://fornax-platform.org/nexus/content/repositories/public -DgroupId=$PACKAGE -DartifactId=$SYS_NAME-web -Dpackage=$PACKAGE -Dversion=1.0-SNAPSHOT

sleep 1

cd $SYS_NAME-parent
mvn install
sleep 1

mvn -DdownloadSources=false eclipse:eclipse
cd ..
