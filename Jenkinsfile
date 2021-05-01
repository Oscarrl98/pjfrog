pipeline{
	agent any
	stages{
		stage('INICIANDO'){
				enviroment{
					MAVEN_HOME='/usr/share/maven'
				}
			steps
				echo 'iniciando publicacion'
				rtMavenDeployer{
					id:'ISP2-P',
					serverId:'artifactory',
					releaseRepo:'ISP2',
					snapshotRepo:'ISP2',
				}
				rtMavenRun{
					pom:'pom.xml',
					goals:'install',
					deployerId:'ISP2-P'
				}
					echo 'Publicacion ExitosA'
			}
      }
}
