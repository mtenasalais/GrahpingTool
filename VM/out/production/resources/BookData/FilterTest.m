close all
clear all
clc
format long
%Right knee extension
filenames =["P1\ACFT\P1DeadLiftData.xlsx","P1\ACFT\P1DragData.xlsx","P1\ACFT\P1HandReleasePushUpData.xlsx","P1\ACFT\P1KettleBellCarryData.xlsx","P1\ACFT\P1SprintData.xlsx"] ;



data = xlsread(filenames(1),'Joint Torque Data');
TimeData = data(1,:);
columnData = data(11,:);
yy = smooth(columnData);
plot(TimeData,columnData,'b.',TimeData,yy,'r-')

xlswrite(filename,TimeData,'Sheet1','A62')