#!/bin/bash
if [ -n "$1" ]
	then
	  fileName=$1
	  shift
	  ./BUILD.sh "$fileName"
	  java -cp utils.jar\;"$fileName".jar introduction._"$fileName"Kt ""$*""
	else
		echo 'Expected kotlin file name'
fi