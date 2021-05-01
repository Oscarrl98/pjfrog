pipeline{
	agent any
	stages{
		stage('INICIANDO'){
				
			steps{
					enviroment{
					MAVEN_HOME='/usr/share/maven'
				}
				echo 'iniciando publicacion'

				rtMavenDeployer(
					id: 'ISP2_P',
					serverId: 'artifactory',
					releaseRepo: 'ISP2',
					snapshotRepo: 'ISP2',
				)
				rtMavenRun(
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'ISP2_P'
				)
					echo 'Publicacion ExitosA'
			}
      }
}
}
