#!/bin/bash
if [ -n "$1" ]
	then
	  nameFile=$1
	  shift
	  ./BUILD.sh "$nameFile"
	  java -cp utils.jar\;"$nameFile".jar introduction._"$nameFile"Kt "$*"
	else
		echo 'Expected kotlin file name'
fi