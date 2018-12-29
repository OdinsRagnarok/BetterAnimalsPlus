package its_meow.betteranimalsplus.client.model;

import its_meow.betteranimalsplus.common.entity.EntityGoat;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.MathHelper;

/**
 * goat - cybercat5555
 * Created using Tabula 5.1.0
 */
public class ModelGoat extends ModelBetterAnimals {
	public ModelRenderer chest;
	public ModelRenderer neck;
	public ModelRenderer stomach;
	public ModelRenderer lArm01;
	public ModelRenderer rArm01;
	public ModelRenderer head;
	public ModelRenderer neckFloof01;
	public ModelRenderer neckFloof02;
	public ModelRenderer snout;
	public ModelRenderer upperJaw01;
	public ModelRenderer upperJaw02;
	public ModelRenderer lowerJaw;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer lHorn01a;
	public ModelRenderer rHorn01a;
	public ModelRenderer beard;
	public ModelRenderer lHorn01b;
	public ModelRenderer lHorn01c;
	public ModelRenderer lHorn01d;
	public ModelRenderer lHorn02a;
	public ModelRenderer lHorn02b;
	public ModelRenderer lHorn02c;
	public ModelRenderer lHorn02d;
	public ModelRenderer lHorn03;
	public ModelRenderer lHorn04;
	public ModelRenderer rHorn01b;
	public ModelRenderer rHorn01c;
	public ModelRenderer rHorn01d;
	public ModelRenderer rHorn02a;
	public ModelRenderer rHorn02b;
	public ModelRenderer rHorn02c;
	public ModelRenderer rHorn02d;
	public ModelRenderer rHorn03;
	public ModelRenderer rHorn04;
	public ModelRenderer hips;
	public ModelRenderer tail;
	public ModelRenderer lLeg01;
	public ModelRenderer rLeg01;
	public ModelRenderer udder;
	public ModelRenderer tailFloof;
	public ModelRenderer lLeg02;
	public ModelRenderer lLegFur;
	public ModelRenderer lLeg03;
	public ModelRenderer lLegHoof;
	public ModelRenderer rLeg02;
	public ModelRenderer rLegFur;
	public ModelRenderer rLeg03;
	public ModelRenderer rLegHoof;
	public ModelRenderer lArm02;
	public ModelRenderer lArmFur;
	public ModelRenderer lArm03;
	public ModelRenderer lArmHoof;
	public ModelRenderer rArm02;
	public ModelRenderer rArmFur;
	public ModelRenderer rArm03;
	public ModelRenderer rArmHoof;

	public ModelGoat() {
		this.textureWidth = 64;
		this.textureHeight = 64;
		this.upperJaw02 = new ModelRenderer(this, 34, 55);
		this.upperJaw02.setRotationPoint(0.0F, 1.9F, 0.7F);
		this.upperJaw02.addBox(-1.9F, 0.0F, -1.0F, 1, 5, 2, 0.0F);
		this.lEar = new ModelRenderer(this, 52, 0);
		this.lEar.setRotationPoint(2.2F, 1.7F, -0.8F);
		this.lEar.addBox(0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(lEar, 0.0F, 0.05235987755982988F, 0.0F);
		this.rHorn04 = new ModelRenderer(this, 31, 5);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.rHorn04.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn04, -0.19198621771937624F, 0.0F, 0.0F);
		this.lowerJaw = new ModelRenderer(this, 52, 56);
		this.lowerJaw.setRotationPoint(0.0F, 2.6F, 1.6F);
		this.lowerJaw.addBox(-1.5F, 0.2F, -0.3F, 3, 4, 1, 0.0F);
		this.lHorn02b = new ModelRenderer(this, 31, 0);
		this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02b.addBox(-0.7F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.neckFloof01 = new ModelRenderer(this, 52, 45);
		this.neckFloof01.setRotationPoint(0.0F, 1.0F, -2.5F);
		this.neckFloof01.addBox(-2.0F, 0.3F, -1.0F, 4, 6, 2, 0.0F);
		this.setRotateAngle(neckFloof01, 0.7853981633974483F, 0.0F, 0.0F);
		this.chest = new ModelRenderer(this, 0, 0);
		this.chest.setRotationPoint(0.0F, 10.4F, -6.0F);
		this.chest.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 6, 0.0F);
		this.setRotateAngle(chest, -0.05235987755982988F, 0.0F, 0.0F);
		this.rHorn02a = new ModelRenderer(this, 31, 0);
		this.rHorn02a.mirror = true;
		this.rHorn02a.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.rHorn02a.addBox(-0.3F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn02a, -0.22689280275926282F, 0.05235987755982988F, 0.03490658503988659F);
		this.lHorn02d = new ModelRenderer(this, 31, 0);
		this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02d.addBox(-0.7F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.udder = new ModelRenderer(this, 35, 47);
		this.udder.setRotationPoint(0.0F, 4.1F, 2.3F);
		this.udder.addBox(-2.0F, -0.7F, -2.0F, 4, 3, 4, 0.0F);
		this.setRotateAngle(udder, 0.13962634015954636F, 0.0F, 0.0F);
		this.tail = new ModelRenderer(this, 0, 27);
		this.tail.setRotationPoint(0.0F, -2.3F, 2.9F);
		this.tail.addBox(-1.5F, -4.0F, -1.0F, 3, 4, 2, 0.0F);
		this.setRotateAngle(tail, -0.7330382858376184F, 0.0F, 0.0F);
		this.lArm02 = new ModelRenderer(this, 25, 28);
		this.lArm02.setRotationPoint(0.5F, 3.5F, 0.0F);
		this.lArm02.addBox(-1.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.beard = new ModelRenderer(this, 0, 56);
		this.beard.setRotationPoint(0.0F, 2.8F, 0.5F);
		this.beard.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
		this.lHorn03 = new ModelRenderer(this, 31, 5);
		this.lHorn03.setRotationPoint(0.0F, -2.8F, 0.0F);
		this.lHorn03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn03, -0.17453292519943295F, 0.0F, 0.0F);
		this.rLeg03 = new ModelRenderer(this, 43, 39);
		this.rLeg03.mirror = true;
		this.rLeg03.setRotationPoint(0.0F, 4.6F, 0.2F);
		this.rLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(rLeg03, -0.296705972839036F, 0.0F, -0.05235987755982988F);
		this.rHorn02b = new ModelRenderer(this, 31, 0);
		this.rHorn02b.mirror = true;
		this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02b.addBox(-0.7F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.lLeg01 = new ModelRenderer(this, 41, 18);
		this.lLeg01.setRotationPoint(1.2F, -0.3F, 2.8F);
		this.lLeg01.addBox(0.0F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(lLeg01, -0.2792526803190927F, 0.0F, -0.05235987755982988F);
		this.upperJaw01 = new ModelRenderer(this, 41, 55);
		this.upperJaw01.setRotationPoint(0.0F, 1.9F, 0.7F);
		this.upperJaw01.addBox(-1.1F, 0.0F, -1.0F, 3, 5, 2, 0.0F);
		this.neck = new ModelRenderer(this, 12, 51);
		this.neck.setRotationPoint(0.0F, 0.0F, -1.0F);
		this.neck.addBox(-2.0F, -3.0F, -6.1F, 4, 5, 6, 0.0F);
		this.setRotateAngle(neck, -0.6981317007977318F, 0.0F, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 42, 29);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(-1.4F, 3.9F, -0.4F);
		this.rLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(rLeg02, 0.6981317007977318F, 0.0F, 0.0F);
		this.rArmHoof = new ModelRenderer(this, 25, 45);
		this.rArmHoof.mirror = true;
		this.rArmHoof.setRotationPoint(0.0F, 6.9F, 0.0F);
		this.rArmHoof.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F);
		this.setRotateAngle(rArmHoof, 0.03490658503988659F, 0.0F, 0.0F);
		this.rHorn01a = new ModelRenderer(this, 22, 0);
		this.rHorn01a.mirror = true;
		this.rHorn01a.setRotationPoint(-1.2F, 1.2F, -1.6F);
		this.rHorn01a.addBox(-0.1F, -2.4F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn01a, 0.7330382858376184F, 0.0F, -0.20943951023931953F);
		this.rLeg01 = new ModelRenderer(this, 41, 18);
		this.rLeg01.mirror = true;
		this.rLeg01.setRotationPoint(-1.2F, -0.3F, 2.8F);
		this.rLeg01.addBox(-3.0F, -1.0F, -2.0F, 3, 6, 4, 0.0F);
		this.setRotateAngle(rLeg01, -0.2792526803190927F, 0.0F, 0.05235987755982988F);
		this.rArm01 = new ModelRenderer(this, 25, 18);
		this.rArm01.mirror = true;
		this.rArm01.setRotationPoint(-1.9F, 0.7F, 0.0F);
		this.rArm01.addBox(-2.7F, -1.0F, -2.0F, 3, 5, 4, 0.0F);
		this.setRotateAngle(rArm01, 0.08726646259971647F, 0.0F, 0.05235987755982988F);
		this.rArm03 = new ModelRenderer(this, 27, 34);
		this.rArm03.mirror = true;
		this.rArm03.setRotationPoint(0.5F, 1.6F, 0.0F);
		this.rArm03.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(rArm03, -0.06981317007977318F, 0.0F, -0.05235987755982988F);
		this.lHorn02a = new ModelRenderer(this, 31, 0);
		this.lHorn02a.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.lHorn02a.addBox(-0.3F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn02a, -0.22689280275926282F, -0.05235987755982988F, -0.03490658503988659F);
		this.rHorn02c = new ModelRenderer(this, 31, 0);
		this.rHorn02c.mirror = true;
		this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02c.addBox(-0.3F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.lHorn04 = new ModelRenderer(this, 31, 5);
		this.lHorn04.setRotationPoint(0.0F, -1.8F, 0.0F);
		this.lHorn04.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn04, -0.19198621771937624F, 0.0F, 0.0F);
		this.rHorn01d = new ModelRenderer(this, 22, 0);
		this.rHorn01d.mirror = true;
		this.rHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01d.addBox(-0.9F, -2.4F, -0.1F, 1, 2, 1, 0.0F);
		this.lLegHoof = new ModelRenderer(this, 25, 45);
		this.lLegHoof.setRotationPoint(0.0F, 4.7F, 0.0F);
		this.lLegHoof.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F);
		this.lArmHoof = new ModelRenderer(this, 25, 45);
		this.lArmHoof.setRotationPoint(0.0F, 6.9F, 0.0F);
		this.lArmHoof.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F);
		this.setRotateAngle(lArmHoof, 0.03490658503988659F, 0.0F, 0.0F);
		this.lLeg02 = new ModelRenderer(this, 42, 29);
		this.lLeg02.setRotationPoint(1.4F, 3.9F, -0.4F);
		this.lLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
		this.setRotateAngle(lLeg02, 0.6981317007977318F, 0.0F, 0.0F);
		this.rLegFur = new ModelRenderer(this, 55, 16);
		this.rLegFur.setRotationPoint(-2.4F, 1.6F, 1.2F);
		this.rLegFur.addBox(0.0F, -2.4F, 0.0F, 0, 7, 4, 0.0F);
		this.setRotateAngle(rLegFur, -0.13962634015954636F, 0.0F, -0.10471975511965977F);
		this.lHorn01a = new ModelRenderer(this, 22, 0);
		this.lHorn01a.setRotationPoint(1.2F, 1.2F, -1.6F);
		this.lHorn01a.addBox(-0.2F, -2.4F, -0.8F, 1, 2, 1, 0.0F);
		this.setRotateAngle(lHorn01a, 0.7330382858376184F, 0.0F, 0.20943951023931953F);
		this.lHorn01d = new ModelRenderer(this, 22, 0);
		this.lHorn01d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01d.addBox(-0.8F, -2.4F, -0.2F, 1, 2, 1, 0.0F);
		this.tailFloof = new ModelRenderer(this, 11, 27);
		this.tailFloof.setRotationPoint(0.0F, -0.1F, 1.9F);
		this.tailFloof.addBox(-1.0F, -4.4F, -1.4F, 2, 5, 3, 0.0F);
		this.setRotateAngle(tailFloof, 0.18203784098300857F, 0.0F, 0.0F);
		this.lArm01 = new ModelRenderer(this, 25, 18);
		this.lArm01.setRotationPoint(1.9F, 0.7F, 0.0F);
		this.lArm01.addBox(-0.3F, -1.0F, -2.0F, 3, 5, 4, 0.0F);
		this.setRotateAngle(lArm01, 0.08726646259971647F, 0.0F, -0.05235987755982988F);
		this.snout = new ModelRenderer(this, 0, 47);
		this.snout.setRotationPoint(0.0F, 3.2F, -0.7F);
		this.snout.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 2, 0.0F);
		this.setRotateAngle(snout, 0.41887902047863906F, 0.0F, 0.0F);
		this.lHorn01b = new ModelRenderer(this, 22, 0);
		this.lHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01b.addBox(-0.8F, -2.4F, -0.8F, 1, 2, 1, 0.0F);
		this.rHorn01b = new ModelRenderer(this, 22, 0);
		this.rHorn01b.mirror = true;
		this.rHorn01b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01b.addBox(-0.9F, -2.4F, -0.8F, 1, 2, 1, 0.0F);
		this.rArm02 = new ModelRenderer(this, 25, 28);
		this.rArm02.mirror = true;
		this.rArm02.setRotationPoint(-1.5F, 3.5F, 0.0F);
		this.rArm02.addBox(-1.0F, 0.0F, -1.5F, 3, 2, 3, 0.0F);
		this.lHorn02c = new ModelRenderer(this, 31, 0);
		this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn02c.addBox(-0.3F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.rHorn02d = new ModelRenderer(this, 31, 0);
		this.rHorn02d.mirror = true;
		this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn02d.addBox(-0.7F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
		this.rLegHoof = new ModelRenderer(this, 25, 45);
		this.rLegHoof.mirror = true;
		this.rLegHoof.setRotationPoint(0.0F, 4.7F, 0.0F);
		this.rLegHoof.addBox(-1.5F, 0.0F, -2.0F, 3, 1, 3, 0.0F);
		this.rHorn03 = new ModelRenderer(this, 31, 5);
		this.rHorn03.mirror = true;
		this.rHorn03.setRotationPoint(0.0F, -2.8F, 0.0F);
		this.rHorn03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(rHorn03, -0.17453292519943295F, 0.0F, 0.0F);
		this.lArmFur = new ModelRenderer(this, 55, 25);
		this.lArmFur.setRotationPoint(2.2F, 2.0F, 1.1F);
		this.lArmFur.addBox(0.0F, -2.4F, 0.0F, 0, 7, 4, 0.0F);
		this.setRotateAngle(lArmFur, -0.3141592653589793F, 0.0F, 0.10471975511965977F);
		this.stomach = new ModelRenderer(this, 27, 0);
		this.stomach.setRotationPoint(0.0F, 0.4F, 2.4F);
		this.stomach.addBox(-4.0F, -3.5F, 0.0F, 8, 8, 9, 0.0F);
		this.setRotateAngle(stomach, 0.05235987755982988F, 0.0F, 0.0F);
		this.rEar = new ModelRenderer(this, 52, 0);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.2F, 1.7F, -0.8F);
		this.rEar.addBox(-3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F);
		this.setRotateAngle(rEar, 0.0F, -0.05235987755982988F, 0.0F);
		this.hips = new ModelRenderer(this, 0, 14);
		this.hips.setRotationPoint(0.0F, -0.4F, 8.4F);
		this.hips.addBox(-3.0F, -3.0F, -0.5F, 6, 7, 5, 0.0F);
		this.setRotateAngle(hips, -0.13962634015954636F, 0.0F, 0.0F);
		this.lHorn01c = new ModelRenderer(this, 22, 0);
		this.lHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn01c.addBox(-0.2F, -2.4F, -0.2F, 1, 2, 1, 0.0F);
		this.neckFloof02 = new ModelRenderer(this, 52, 38);
		this.neckFloof02.setRotationPoint(0.0F, 1.0F, -3.9F);
		this.neckFloof02.addBox(-1.5F, 0.3F, -1.0F, 3, 4, 2, 0.0F);
		this.setRotateAngle(neckFloof02, 0.6981317007977318F, 0.0F, 0.0F);
		this.rHorn01c = new ModelRenderer(this, 22, 0);
		this.rHorn01c.mirror = true;
		this.rHorn01c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn01c.addBox(-0.1F, -2.4F, -0.1F, 1, 2, 1, 0.0F);
		this.lLeg03 = new ModelRenderer(this, 43, 39);
		this.lLeg03.setRotationPoint(0.0F, 4.6F, 0.2F);
		this.lLeg03.addBox(-1.0F, 0.0F, -1.0F, 2, 5, 2, 0.0F);
		this.setRotateAngle(lLeg03, -0.296705972839036F, 0.0F, 0.05235987755982988F);
		this.head = new ModelRenderer(this, 0, 37);
		this.head.setRotationPoint(0.0F, -1.5F, -4.7F);
		this.head.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
		this.setRotateAngle(head, -0.7853981633974483F, 0.0F, 0.0F);
		this.lLegFur = new ModelRenderer(this, 55, 16);
		this.lLegFur.setRotationPoint(2.4F, 1.6F, 1.2F);
		this.lLegFur.addBox(0.0F, -2.4F, 0.0F, 0, 7, 4, 0.0F);
		this.setRotateAngle(lLegFur, -0.13962634015954636F, 0.0F, 0.10471975511965977F);
		this.lArm03 = new ModelRenderer(this, 27, 34);
		this.lArm03.setRotationPoint(0.5F, 1.6F, 0.0F);
		this.lArm03.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
		this.setRotateAngle(lArm03, -0.06981317007977318F, 0.0F, 0.05235987755982988F);
		this.rArmFur = new ModelRenderer(this, 55, 25);
		this.rArmFur.setRotationPoint(-2.2F, 2.0F, 1.1F);
		this.rArmFur.addBox(0.0F, -2.4F, 0.0F, 0, 7, 4, 0.0F);
		this.setRotateAngle(rArmFur, -0.3141592653589793F, 0.0F, -0.10471975511965977F);
		this.head.addChild(this.upperJaw02);
		this.head.addChild(this.lEar);
		this.rHorn03.addChild(this.rHorn04);
		this.head.addChild(this.lowerJaw);
		this.lHorn02a.addChild(this.lHorn02b);
		this.neck.addChild(this.neckFloof01);
		this.rHorn01a.addChild(this.rHorn02a);
		this.lHorn02a.addChild(this.lHorn02d);
		this.hips.addChild(this.udder);
		this.hips.addChild(this.tail);
		this.lArm01.addChild(this.lArm02);
		this.lowerJaw.addChild(this.beard);
		this.lHorn02a.addChild(this.lHorn03);
		this.rLeg02.addChild(this.rLeg03);
		this.rHorn02a.addChild(this.rHorn02b);
		this.hips.addChild(this.lLeg01);
		this.head.addChild(this.upperJaw01);
		this.chest.addChild(this.neck);
		this.rLeg01.addChild(this.rLeg02);
		this.rArm03.addChild(this.rArmHoof);
		this.head.addChild(this.rHorn01a);
		this.hips.addChild(this.rLeg01);
		this.chest.addChild(this.rArm01);
		this.rArm02.addChild(this.rArm03);
		this.lHorn01a.addChild(this.lHorn02a);
		this.rHorn02a.addChild(this.rHorn02c);
		this.lHorn03.addChild(this.lHorn04);
		this.rHorn01a.addChild(this.rHorn01d);
		this.lLeg03.addChild(this.lLegHoof);
		this.lArm03.addChild(this.lArmHoof);
		this.lLeg01.addChild(this.lLeg02);
		this.rLeg01.addChild(this.rLegFur);
		this.head.addChild(this.lHorn01a);
		this.lHorn01a.addChild(this.lHorn01d);
		this.tail.addChild(this.tailFloof);
		this.chest.addChild(this.lArm01);
		this.head.addChild(this.snout);
		this.lHorn01a.addChild(this.lHorn01b);
		this.rHorn01a.addChild(this.rHorn01b);
		this.rArm01.addChild(this.rArm02);
		this.lHorn02a.addChild(this.lHorn02c);
		this.rHorn02a.addChild(this.rHorn02d);
		this.rLeg03.addChild(this.rLegHoof);
		this.rHorn02a.addChild(this.rHorn03);
		this.lArm01.addChild(this.lArmFur);
		this.chest.addChild(this.stomach);
		this.head.addChild(this.rEar);
		this.stomach.addChild(this.hips);
		this.lHorn01a.addChild(this.lHorn01c);
		this.neck.addChild(this.neckFloof02);
		this.rHorn01a.addChild(this.rHorn01c);
		this.lLeg02.addChild(this.lLeg03);
		this.neck.addChild(this.head);
		this.lLeg01.addChild(this.lLegFur);
		this.lArm02.addChild(this.lArm03);
		this.rArm01.addChild(this.rArmFur);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
		this.chest.render(f5);
	}

	@Override
	public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scaleFactor, Entity entityIn) {
		float swingModifier = 1.5F;
		this.lLeg01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;
		this.rLeg01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
		this.lArm01.rotateAngleX = MathHelper.sin(limbSwing * 0.8665F) * swingModifier * limbSwingAmount;
		this.rArm01.rotateAngleX = MathHelper.cos(limbSwing * 0.8665F + (float) Math.PI) * swingModifier * limbSwingAmount;

		if(entityIn instanceof EntityGoat) {
			EntityGoat goat = (EntityGoat) entityIn;
			this.neck.rotateAngleX = goat.getHeadPitch(); // Ram attack
		}
		if(entityIn instanceof EntityLiving) {
			this.neck.rotateAngleY = ModelBetterAnimals.getHeadYaw((EntityLiving) entityIn) * 0.017453292F * 0.5F;
		}

		super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
	}

	/**
	 * This is a helper function from Tabula to set the rotation of model parts
	 */
	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
