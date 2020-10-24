#!/bin/bash
if [ -n "$1" ]
	then
	  fileName=$1
	  DIR=$2
	  shift
	  shift
	  ./BUILD.sh "$fileName" "$DIR"
	  java -cp utils.jar\;"$fileName".jar introduction._"$fileName"Kt ""$*""
	else
		echo 'Expected kotlin file name'
fi