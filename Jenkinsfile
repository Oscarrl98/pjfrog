pipeline{
	agent any 
	stages{
		stage('Desplegando artefacto'){
				environment {
					MAVEN_HOME = '/usr/share/maven'
				}
			steps{
					echo 'Iniciando despliegue'
				
				rtMavenDeployer (
					id: 'ISP2_P',
					serverId: 'artifactory',
					releaseRepo: 'isp2',
					snapshotRepo: 'isp2',
				)
				rtMavenRun (
					pom: 'pom.xml',
					goals: 'install',
					deployerId: 'ISP2_P',
				)
					echo 'Finalizando Despliegue'
				
			
			}
		}
		
	}
}
