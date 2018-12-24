# Given an xml object from a log file, example of which is as follows - 
#
# <log>
#    <entry id=1>
#        <message>Deployment Started</message>
#    </entry>
#    <entry id=2>
#        <message>Deployment Ended</message>
#    </entry>
# </log>
#
#
# Given a log in xml format, and a specific message, you need to find if the message
# exists in the log, and if it does, return the ids of the entries for which the message
# is present 
#
# Example: If message = "Deployment Ended"
#          then Output = [2]
