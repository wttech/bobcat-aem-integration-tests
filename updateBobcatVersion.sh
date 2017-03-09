#/bin/bash

# This script is checking wheter version maven plugin have changed Bobcat's versions in the pom.xml. 
# The plugin changes them only if a newer version is available. 
# When changes are detected, they are commited and pushed to the repository.

git diff --quiet pom.xml

if [ "$(echo $?)" -eq 0 ]; then
	echo "Integration tests are using the latest version of Bobcat. No changes required";
else
	echo "Stale version of Bobcat dependency detected in the repository! Commiting changes with the latest versions in project's pom file"
	git add pom.xml
	git commit -m "Updated Bobcat to the latest available version"
	git push
fi
