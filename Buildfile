repositories.remote << 'http://repo1.maven.org/maven2'

JUNIT = 'junit:junit:jar:4.8.2'
HAMCREST = 'org.hamcrest:hamcrest-all:jar:1.1'

define 'subzero' do
  project.version = '0.1.0'
  package :jar
  test.with JUNIT, HAMCREST
end

