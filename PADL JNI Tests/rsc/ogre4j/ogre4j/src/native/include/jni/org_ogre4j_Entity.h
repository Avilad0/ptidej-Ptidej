/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_ogre4j_Entity */

#ifndef _Included_org_ogre4j_Entity
#define _Included_org_ogre4j_Entity
#ifdef __cplusplus
extern "C" {
#endif
/* Inaccessible static: table */
/*
 * Class:     org_ogre4j_Entity
 * Method:    attachObjectToBone
 * Signature: (ILjava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_org_ogre4j_Entity_attachObjectToBone__ILjava_lang_String_2I
  (JNIEnv *, jclass, jint, jstring, jint);

/*
 * Class:     org_ogre4j_Entity
 * Method:    attachObjectToBone
 * Signature: (ILjava/lang/String;IFFFFFFF)V
 */
JNIEXPORT void JNICALL Java_org_ogre4j_Entity_attachObjectToBone__ILjava_lang_String_2IFFFFFFF
  (JNIEnv *, jclass, jint, jstring, jint, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat, jfloat);

/*
 * Class:     org_ogre4j_Entity
 * Method:    clone
 * Signature: (ILjava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_clone
  (JNIEnv *, jclass, jint, jstring);

/*
 * Class:     org_ogre4j_Entity
 * Method:    detachObjectFromBone
 * Signature: (ILjava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_detachObjectFromBone
  (JNIEnv *, jclass, jint, jstring);

/*
 * Class:     org_ogre4j_Entity
 * Method:    getAnimationState
 * Signature: (ILjava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_getAnimationState
  (JNIEnv *, jclass, jint, jstring);

/*
 * Class:     org_ogre4j_Entity
 * Method:    getMesh
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_getMesh
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_ogre4j_Entity
 * Method:    getNumSubEntities
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_getNumSubEntities
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_ogre4j_Entity
 * Method:    getSkeleton
 * Signature: (I)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_getSkeleton
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_ogre4j_Entity
 * Method:    getSubEntity
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_getSubEntity__II
  (JNIEnv *, jclass, jint, jint);

/*
 * Class:     org_ogre4j_Entity
 * Method:    getSubEntity
 * Signature: (ILjava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_org_ogre4j_Entity_getSubEntity__ILjava_lang_String_2
  (JNIEnv *, jclass, jint, jstring);

/*
 * Class:     org_ogre4j_Entity
 * Method:    hasSkeleton
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_org_ogre4j_Entity_hasSkeleton
  (JNIEnv *, jclass, jint);

/*
 * Class:     org_ogre4j_Entity
 * Method:    setDisplaySkeleton
 * Signature: (IZ)V
 */
JNIEXPORT void JNICALL Java_org_ogre4j_Entity_setDisplaySkeleton
  (JNIEnv *, jclass, jint, jboolean);

/*
 * Class:     org_ogre4j_Entity
 * Method:    setMaterialName
 * Signature: (ILjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_ogre4j_Entity_setMaterialName
  (JNIEnv *, jclass, jint, jstring);

#ifdef __cplusplus
}
#endif
#endif